# Utils 工具类
#### App 在Application里初始化Utils
    MyUtils.init(this);
#### MyUtils 工具需要初始化
    MyUtils.init(context)：用于初始化工具类
    MyUtils.getContext()：方便其他工具类调用上下文

#### AppUtil App工具类
    AppUtil.installApp()： 安装APP(支持7.0)
	AppUtil.installAppSilent()：静默安装App
	AppUtil.isSystemApp()：判断App是否是系统应用
	AppUtil.uninstallApp()：卸载App
	AppUtil.uninstallAppSilent()：静默卸载App
	AppUtil.isAppRoot()：判断App是否有root权限
	AppUtil.launchApp()：打开App
	AppUtil.getAppPackageName()：获取App包名
	AppUtil.getAppDetailsSettings()：获取App具体设置
	AppUtil.getAppName()：获取App名称
	AppUtil.getAppIcon()：获取App图标
	AppUtil.getAppPath()：获取App路径
	AppUtil.getAppVersionName()：获取App版本号
    AppUtil.getAppVersionCode()：获取App版本码
	AppUtil.isAppDebug()：判断App是否是Debug版本
	AppUtil.getAppSignature()：获取App签名
	AppUtil.isInstallApp()：判断App是否安装
	AppUtil.getAppInfo()：获取当前App信息
	AppUtil.getAllAppsInfo()：获取所有已安装App信息
	AppUtil.cleanAppData()：清除App所有数据
#### DataUtil 数据处理工具
	DataUtil.isNullString()：判断字符串是否为空 为空即true
    DataUtil.byte2FitSize()：字节数转合适大小
    DataUtil.hideEndString()：隐藏字符串末尾
    DataUtil.hideMiddleString()：隐藏字符串中间字符
    DataUtil.inputStream2Bytes()：inputStream转byteArr
    DataUtil.input2OutputStream()：inputStream转outputStream
#### DensityUtil 像素转换工具
	DensityUtil.getScreenWidth()：获取屏幕的宽度
	DensityUtil.getScreenHeight()：获取屏幕的高度
	DensityUtil.dip2px()：dp转换像素px
	DensityUtil.getScreenSize()：获取屏幕尺寸
	DensityUtil.px2dip()：像素px转换为dp
#### FileUtil File文件工具
	FileUtil.getRootPath()：得到SD卡根目录
	FileUtil.getCecheFolder()：获取本应用图片缓存目录
	FileUtil.isSDCardEnable()：判断SD卡是否可用
	FileUtil.getSDCardPath()：获取SD卡路径
	FileUtil.getDataPath()：获取SD卡Data路径
	FileUtil.getFreeSpace()：获取SD卡剩余空间
	FileUtil.sdCardIsAvailable()：SD卡是否可用
	FileUtil.fileExists()：文件或者文件夹是否存在
	FileUtil.delAllFile()：删除指定文件夹下所有文件, 不保留文件夹
	FileUtil.deleteFilesInDir()：删除目录下的所有文件
	FileUtil.cleanInternalCache()：清除内部缓存
	FileUtil.cleanInternalFiles()：清除内部文件
	FileUtil.cleanInternalDbs()：清除内部数据库
	FileUtil.cleanInternalDbByName()：根据名称清除数据库
	FileUtil.cleanInternalSP()：清除内部SP
	FileUtil.cleanExternalCache()：清除外部缓存
	FileUtil.cleanCustomCache()：清除自定义目录下的文件
	FileUtil.copyFolder()：复制整个文件夹内
	FileUtil.renameFile()：重命名文件
	FileUtil.getSDCardAvailaleSize()：获取磁盘可用空间
	FileUtil.getDirSize()：获取某个目录可用大小
	FileUtil.getFileAllSize()：获取文件或者文件夹大小
	FileUtil.initFile()：创建一个文件
	FileUtil.initDirectory()：创建一个文件夹
	FileUtil.copyFile()：复制文件
	FileUtil.saveFile()：保存InputStream流到文件
	FileUtil.saveFileUTF8()：用UTF8保存一个文件
	FileUtil.getFileUTF8()：用UTF8读取一个文件
	FileUtil.getFileIntent()：得到一个文件Intent
	FileUtil.getDiskCacheDir()：获取缓存目录
	FileUtil.getDiskFileDir()：获取缓存视频文件目录
	FileUtil.mergeFiles()：多个文件合并
	FileUtil.getNativeM3u()：将在线的m3u8替换成本地的m3u8
	FileUtil.write()：将字符串保存成文件
	FileUtil.getAllFileName()：获取搜索的路径下的所有后缀的文件
	FileUtil.getFileByPath()：根据文件路径获取文件
	FileUtil.isFileExists()：判断文件是否存在
	FileUtil.isDir()：判断是否是目录
	FileUtil.isFile()：判断是否是文件
	FileUtil.createOrExistsDir()：判断目录是否存在，不存在则判断是否创建成功
	FileUtil.createOrExistsFile()：判断文件是否存在，不存在则判断是否创建成功
	FileUtil.createFileByDeleteOldFile()：判断文件是否存在，存在则在创建之前删除
	FileUtil.copyOrMoveDir()：复制或移动目录
	FileUtil.copyDir()：复制目录
	FileUtil.copyFile()：复制文件
	FileUtil.moveDir()：移动目录
	FileUtil.moveFile()：移动文件
	FileUtil.deleteDir()：删除目录
	FileUtil.deleteFile()：删除文件
	FileUtil.listFilesInDir()：获取目录下所有文件
	FileUtil.listFilesInDirWithFilter()：获取目录下所有后缀名为suffix的文件
	FileUtil.searchFileInDir()：获取目录下指定文件名的文件包括子目录
	FileUtil.writeFileFromIS()：将输入流写入文件
	FileUtil.writeFileFromString()：将字符串写入文件
	FileUtil.readFile2List()：指定编码按行读取文件到List
	FileUtil.readFile2Bytes()：指定编码按行读取文件到字符数组中
	FileUtil.getFileCharsetSimple()：简单获取文件编码格式
	FileUtil.getFileLines()：获取文件行数
	FileUtil.getFileSize()：获取文件大小
	FileUtil.closeIO()：关闭IO
	FileUtil.getDirName()：获取全路径中的最长目录
	FileUtil.getFileName()：获取全路径中的文件名
	FileUtil.getFileNameNoExtension()：获取全路径中的不带拓展名的文件名
	FileUtil.getFileExtension()：获取全路径中的文件拓展名
	FileUtil.getUriForFile()：将文件转换成uri(支持7.0)
	FileUtil.getImageContentUri()：将图片文件转换成uri
	FileUtil.getFilePhotoFromUri()：将Uri转换成File
	FileUtil.closeIOQuietly()：安静关闭IO
	FileUtil.file2Base64()：将文件进行Base64加密
	FileUtil.TextToFile()：传入文件名以及字符串, 将字符串信息保存到文件中
	FileUtil.readFileByLines()：以行为单位读取文件，常用于读面向行的格式化文件
#### IntentUtil Intent工具类
    IntentUtil.getInstallAppIntent()：获取安装App(支持7.0)的意图
    IntentUtil.getUninstallAppIntent()：获取卸载App的意图
    IntentUtil.getLaunchAppIntent()：获取打开App的意图
    IntentUtil.getIntentByPackageName()：根据包名获取意图
    IntentUtil.getAppInfoIntent()：获取App信息的意图
    IntentUtil.getShareInfoIntent()：获取App信息分享的意图
    IntentUtil.getComponentNameIntent()：获取其他应用的Intent
    IntentUtil.getAppDetailsSettingsIntent()：获取应用详情页面具体设置
#### KeyboardUtil 键盘工具
	KeyboardUtil.hideSoftInput()：动态隐藏软键盘
	KeyboardUtil.hideKeyboard()：点击隐藏软键盘
	KeyboardUtil.showSoftInput()：动态显示软键盘
	KeyboardUtil.toggleSoftInput()：切换键盘显示与否状态
#### LogUtil Log日志打印操作
	LogUtil.getClassName()：获取当前类名
	LogUtil.w()：warming警告日志
	LogUtil.d()：debug调试日志
	LogUtil.e()：error错误日志
	LogUtil.i()：info信息日志
#### NetworkUtil 网络相关工具
    NetworkUtil.openWirelessSettings()：打开网络设置界面
    NetworkUtil.getActiveNetworkInfo()：获取活动网络信息
    NetworkUtil.isConnected()：判断网络是否连接
    NetworkUtil.isAvailableByPing()：判断网络是否可用
    NetworkUtil.getDataEnabled()：判断移动数据是否打开
    NetworkUtil.setDataEnabled()：打开或关闭移动数据
    NetworkUtil.is4G()：判断网络是否是4G
    NetworkUtil.getWifiEnabled()：判断wifi是否打开
    NetworkUtil.setWifiEnabled()：打开或关闭wifi
    NetworkUtil.isWifiConnected()：判断wifi是否连接状态
    NetworkUtil.isWifiAvailable()：判断wifi数据是否可用
    NetworkUtil.getNetworkOperatorName()：获取网络运营商名称
    NetworkUtil.getNetworkType()：获取当前网络类型
    NetworkUtil.getIPAddress()：获取IP地址
    NetworkUtil.getDomainAddress()：获取域名ip地址
#### PermissionsUtil 权限工具
    PermissionsUtil.with()：with
	PermissionsUtil.addPermission()：动态添加权限
	PermissionsUtil.initPermission()：初始化权限
#### PhotoUtil photo工具
	PhotoUtil.openCameraImage()：打开相机图片
	PhotoUtil.openLocalImage()：打开本地
	PhotoUtil.cropImage()：截图
	PhotoUtil.createImagePathUri()：创建一条图片地址uri,用于保存拍照后的照片
	PhotoUtil.getRealFilePath()：获得真实的文件路径
	PhotoUtil.getImageAbsolutePath()：根据Uri获取图片绝对路径，解决Android4.4以上版本Uri转换
#### ShellUtil Shell相关工具
	ShellUtil.execCmd()：是否是在root下执行命令
#### SPUtil SP工具
	SPUtil.putContent()：存入自定义的标识的数据 可以近似的看作网络下载数据的缓存，单条方式存入
	SPUtil.getContent()：获取以tag命名的存储内
	SPUtil.putString()：SP中写入String类型value
	SPUtil.getString()：SP中读取String
	SPUtil.putInt()：SP中写入int类型value
	SPUtil.getInt()：SP中读取int
	SPUtil.putLong()：SP中写入long类型value
	SPUtil.getLong()：SP中读取long
	SPUtil.putFloat()：SP中写入float类型value
	SPUtil.getFloat()：SP中读取float
	SPUtil.putBoolean()：SP中写入boolean类型value
	SPUtil.getBoolean()：SP中读取boolean
	SPUtil.remove()：SP中移除该key
	SPUtil.putJSONCache()：存放JSON缓存数据
	SPUtil.readJSONCache()：读取JSON缓存数据
	SPUtil.clearPreference()：清除指定的信息
#### ToastUtil Toast工具
	ToastUtil.normal()：正常Toast
	ToastUtil.warning()：警告Toast
	ToastUtil.info()：信息Toast
	ToastUtil.success()：正确Toast
	ToastUtil.error()：错误Toast
	ToastUtil.doubleClickExit()：双击退出

