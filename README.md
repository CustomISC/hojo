![hOjo Logo](/media/icon.png)

# hOjo: RTSP Surveillance camera viewer for Android, with secondary high-res streams

hOjo is a fork of [Ojo](https://github.com/penguin86/ojo), a FLOSS RTSP surveillance camera viewer for Android originally created by [Daniele Verducci](https://github.com/penguin86). This fork is maintained by [CustomISC](https://github.com/CustomISC) and is not affiliated with the original author; full credit for the vast majority of this codebase goes to Daniele Verducci and Ojo's contributors (see below).

[<img src="https://raw.githubusercontent.com/andOTP/andOTP/master/assets/badges/get-it-on-github.png" height="80">](https://github.com/CustomISC/hojo/releases/latest)

Ojo is a basic IP Camera surveillance wall. hOjo adds the ability to configure, per camera, an optional **secondary, high-resolution RTSP stream**: most IP cameras expose a low-resolution "sub stream" (ideal for the multi-camera grid view) alongside a full-resolution main stream. When a secondary URL is configured for a camera, hOjo switches to it whenever that camera is expanded to fullscreen, and switches back to the primary (low-res) stream when returning to the grid.

IP camera's RTSP streams are added via its url and shown in the classic tile configuration. The number of tiles is automatically chosen based on the number of configured cameras: a single camera goes full screen, adding more cameras the app switches to a grid view: 2x2, 3x3, 4x4 and so on.
The maximum number of cameras is determined by the device's capabilities.

The stream decoding and rendering is demanded to [VLC's library](https://code.videolan.org/videolan/vlc-android): without their effort this app wouldn't be possible.

The app can be opened deeplinking to url hojo://view.
To open the app with focus on a specific camera, you can use an intent (com.customisc.hojo.OPEN_CAMERA) to specify which camera you want to view.
The extra argument com.customisc.hojo.CAMERA_NAME will open the app with the camera with the name you specified while adding the camera.
The extra argument com.customisc.hojo.CAMERA_NUMBER starting at 1 could be used as well, if you have multiple cameras with the same name.
See below an example how to use the intent. The flag (-f 268468224) could be useful if you want to switch to an other camera while the app is running.
```shell
adb -s <YOUR_DEVICE> shell am start -a com.customisc.hojo.OPEN_CAMERA -f 268468224 --es com.customisc.hojo.CAMERA_NAME <YOUR_CAMERA_NAME>
adb -s <YOUR_DEVICE> shell am start -a com.customisc.hojo.OPEN_CAMERA -f 268468224 --es com.customisc.hojo.CAMERA_NUMBER <YOUR_CAMERA_NUMBER>
```


![Screenshot 1](media/screenshots/1.png)      ![Screenshot 2](media/screenshots/2.png)      ![Screenshot 3](media/screenshots/3.png)

## License

Like Ojo, hOjo is licensed under the GNU GENERAL PUBLIC LICENSE v3+ (see [LICENSE](LICENSE)), as required for a derivative work of a GPLv3 project.

## Attribution

hOjo is built almost entirely on Daniele Verducci's work on Ojo. Original Ojo contributors:
- [Daniele Verducci](https://github.com/penguin86) - creator and maintainer of Ojo
- Thanks to [brenard](https://github.com/brenard) for the new grid sizing method
- Thanks to [davquar](https://github.com/davquar) for the fullscreen compatibility fix on Android 11
- Thanks to [jayfan0](https://github.com/jayfan0) for the first deep link implementation
- Thanks to [free-bots](https://github.com/free-bots) for the selection border on Android TV, intents for direct camera access and leanback support
- Thanks to Yurt Page for the Russian translation

## How to contribute

Issues and pull requests are welcome on the [CustomISC/hojo](https://github.com/CustomISC/hojo) repository. If you're looking for the original, unforked project, see [penguin86/ojo](https://github.com/penguin86/ojo).
