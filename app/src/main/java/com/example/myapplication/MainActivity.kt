package com.example.myapplication

import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val packageManager: PackageManager = packageManager
        val installedPackages: List<PackageInfo> = packageManager.getInstalledPackages(0)

        val installedApps: MutableList<ApplicationInfo> = mutableListOf()

        println(">>>>>>>>>>> 0000000000000000000000000")
        for (packageInfo in installedPackages) {
            val appInfo: ApplicationInfo = packageInfo.applicationInfo
            println(
                ">>>>>>>>>>> appInfo.loadLabel(packageManager) : ${
                    appInfo.loadLabel(
                        packageManager
                    )
                }"
            )
            println(">>>>>>>>>>> name : ${appInfo.name}")
            println(">>>>>>>>>>> enabled : ${appInfo.enabled} \n")

//            if (appInfo.name != null) {
//                println(">>>>>>>>>>> ${appInfo.name}")
//                println(">>>>>>>>>>> ${appInfo.loadLabel(packageManager).toString()}")
//            }


            installedApps.add(appInfo)
        }
    }
}