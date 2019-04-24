.class public Lcom/huawei/operation/share/CaptureUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CODE_ERROR:I = 0x2

.field private static final CODE_NO_PERMISSION:I = -0x1

.field private static final CODE_SUCCESS:I = 0x1

.field private static final TAG:Ljava/lang/String; = "Opera_CaptureUtils"


# instance fields
.field private context:Landroid/content/Context;

.field private looper:Landroid/os/Looper;

.field private toast:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/share/CaptureUtils;->looper:Landroid/os/Looper;

    .line 49
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils;->context:Landroid/content/Context;

    .line 50
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/share/CaptureUtils;)Landroid/content/Context;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/operation/share/CaptureUtils;)Landroid/widget/Toast;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils;->toast:Landroid/widget/Toast;

    return-object v0
.end method

.method static synthetic access$102(Lcom/huawei/operation/share/CaptureUtils;Landroid/widget/Toast;)Landroid/widget/Toast;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils;->toast:Landroid/widget/Toast;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;ILandroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/operation/share/CaptureUtils;->saveCapture(Landroid/webkit/WebView;ILandroid/graphics/Bitmap;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/huawei/operation/share/CaptureUtils;->capture(Landroid/webkit/WebView;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private capture(Landroid/webkit/WebView;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 97
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 98
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScale()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v4, v0

    .line 99
    invoke-virtual {p1}, Landroid/webkit/WebView;->getMeasuredWidth()I

    move-result v5

    .line 100
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "webView.height = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "webView.width = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    if-lez v4, :cond_0

    if-gtz v5, :cond_1

    .line 103
    :cond_0
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height<=0 || width<=0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_1
    const/4 v6, 0x0

    .line 108
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 109
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 110
    invoke-virtual {p1, v7}, Landroid/webkit/WebView;->draw(Landroid/graphics/Canvas;)V

    .line 111
    const/4 v0, 0x1

    invoke-interface {p2, v0, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 112
    :catch_0
    move-exception v7

    .line 113
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "capture oom"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 117
    :goto_0
    goto/16 :goto_1

    .line 118
    :cond_2
    invoke-virtual {p1}, Landroid/webkit/WebView;->capturePicture()Landroid/graphics/Picture;

    move-result-object v4

    .line 119
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 120
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null==picture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 122
    return-void

    .line 124
    :cond_3
    invoke-virtual {v4}, Landroid/graphics/Picture;->getWidth()I

    move-result v5

    .line 125
    invoke-virtual {v4}, Landroid/graphics/Picture;->getHeight()I

    move-result v6

    .line 126
    if-lez v6, :cond_4

    if-gtz v5, :cond_5

    .line 127
    :cond_4
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height<=0 || width<=0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 129
    return-void

    .line 131
    :cond_5
    const/4 v7, 0x0

    .line 133
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 134
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 135
    invoke-virtual {v4, v8}, Landroid/graphics/Picture;->draw(Landroid/graphics/Canvas;)V

    .line 136
    const/4 v0, 0x1

    invoke-interface {p2, v0, v7}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    goto :goto_1

    .line 137
    :catch_1
    move-exception v8

    .line 138
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "capture oom"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 142
    :goto_1
    return-void
.end method

.method private doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    .locals 7

    .line 225
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$3;

    invoke-direct {v1, p0}, Lcom/huawei/operation/share/CaptureUtils$3;-><init>(Lcom/huawei/operation/share/CaptureUtils;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 233
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils;->looper:Landroid/os/Looper;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 235
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/operation/share/CaptureUtils;->looper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$4;

    move-object v2, p0

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/huawei/operation/share/CaptureUtils$4;-><init>(Lcom/huawei/operation/share/CaptureUtils;Ljava/lang/String;ILjava/lang/String;Landroid/webkit/WebView;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 245
    :cond_0
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "looper = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    :goto_0
    return-void
.end method

.method private saveCapture(Landroid/webkit/WebView;ILandroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 12

    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    const/4 v6, 0x0

    .line 155
    :try_start_0
    invoke-direct {p0, p3}, Lcom/huawei/operation/share/CaptureUtils;->scaleBitmapBySize(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    .line 156
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 157
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEDIA_MOUNTED error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    move-object/from16 v0, p4

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_0

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_0
    if-eqz p3, :cond_1

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_1
    nop

    .line 159
    .line 198
    .line 199
    .line 200
    .line 201
    return-void

    .line 161
    :cond_2
    :try_start_1
    new-instance v7, Ljava/io/File;

    sget-object v0, Lo/dab;->e:Ljava/lang/String;

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 163
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_5

    .line 164
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveCapture:mkdirs error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    move-object/from16 v0, p4

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_3

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_3
    if-eqz p3, :cond_4

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_4
    nop

    .line 166
    .line 198
    .line 199
    .line 200
    .line 201
    return-void

    .line 169
    :cond_5
    :try_start_2
    new-instance v8, Ljava/io/File;

    const-string v0, "webview_capture.jpg"

    invoke-direct {v8, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 170
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 171
    invoke-static {v8, v5}, Lcom/huawei/operation/share/CaptureUtils;->validateFilename(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 172
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalidate file path"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    move-object/from16 v0, p4

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_6

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_6
    if-eqz p3, :cond_7

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_7
    nop

    .line 174
    .line 198
    .line 199
    .line 200
    .line 201
    return-void

    .line 176
    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    .line 177
    if-nez v4, :cond_c

    .line 178
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    move-object/from16 v0, p4

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_9

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_9
    if-eqz p3, :cond_a

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_a
    const/4 v0, 0x0

    if-eq v0, v6, :cond_b

    .line 198
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 201
    goto :goto_0

    .line 199
    :catch_0
    move-exception v9

    .line 200
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    :cond_b
    :goto_0
    return-void

    .line 183
    :cond_c
    :try_start_5
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x50

    invoke-virtual {v4, v0, v1, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_d

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_d
    if-eqz p3, :cond_e

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_e
    const/4 v0, 0x0

    if-eq v0, v6, :cond_14

    .line 198
    :try_start_6
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 201
    goto/16 :goto_2

    .line 199
    :catch_1
    move-exception v7

    .line 200
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    goto/16 :goto_2

    .line 185
    :catch_2
    move-exception v7

    .line 186
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 187
    const/4 p2, 0x2

    .line 189
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_f

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_f
    if-eqz p3, :cond_10

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_10
    const/4 v0, 0x0

    if-eq v0, v6, :cond_14

    .line 198
    :try_start_8
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 201
    goto :goto_2

    .line 199
    :catch_3
    move-exception v7

    .line 200
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    goto :goto_2

    .line 189
    :catchall_0
    move-exception v10

    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0, p2, v5}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 190
    if-eqz v4, :cond_11

    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_11
    if-eqz p3, :cond_12

    .line 194
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 196
    :cond_12
    const/4 v0, 0x0

    if-eq v0, v6, :cond_13

    .line 198
    :try_start_9
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 201
    goto :goto_1

    .line 199
    :catch_4
    move-exception v11

    .line 200
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :cond_13
    :goto_1
    throw v10

    .line 204
    :cond_14
    :goto_2
    return-void
.end method

.method private scaleBitmapBySize(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .line 209
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 210
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v8, v0

    .line 211
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v9, v0

    .line 212
    const v0, 0x4b1a6b40    # 1.012E7f

    div-float/2addr v0, v8

    div-float/2addr v0, v9

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v10, v0

    .line 213
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scale = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v10, v0

    if-lez v0, :cond_0

    .line 215
    return-object p1

    .line 217
    :cond_0
    invoke-virtual {v7, v10, v10}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 219
    move-object v0, p1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static validateFilename(Ljava/io/File;Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 291
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    .line 293
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 294
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    .line 295
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {v6, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v6

    .line 296
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    const/4 v0, 0x1

    return v0

    .line 299
    :cond_0
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "File is outside extraction target directory."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public capture(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .line 58
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$1;

    invoke-direct {v1, p0}, Lcom/huawei/operation/share/CaptureUtils$1;-><init>(Lcom/huawei/operation/share/CaptureUtils;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/operation/share/CaptureUtils$2;-><init>(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Ljava/lang/String;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 84
    return-void
.end method

.method public captureNoPermission(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 53
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    .line 54
    return-void
.end method

.method public share(Ljava/lang/String;)V
    .locals 5

    .line 274
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "share filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    new-instance v4, Lo/dav;

    const/4 v0, 0x4

    invoke-direct {v4, v0}, Lo/dav;-><init>(I)V

    .line 276
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 279
    :cond_0
    invoke-virtual {v4, p1}, Lo/dav;->b(Ljava/lang/String;)V

    .line 280
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lo/dav;->a(I)V

    .line 281
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$6;

    invoke-direct {v1, p0}, Lcom/huawei/operation/share/CaptureUtils$6;-><init>(Lcom/huawei/operation/share/CaptureUtils;)V

    const/4 v2, 0x0

    invoke-static {v0, v4, v2, v1}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 287
    return-void
.end method

.method public share(Ljava/lang/String;I)V
    .locals 5

    .line 256
    const-string v0, "Opera_CaptureUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "share filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 258
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 260
    :cond_0
    new-instance v4, Lo/dav;

    const/4 v0, 0x5

    invoke-direct {v4, v0}, Lo/dav;-><init>(I)V

    .line 261
    invoke-virtual {v4, p1}, Lo/dav;->b(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v4, p2}, Lo/dav;->c(I)V

    .line 263
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lo/dav;->a(I)V

    .line 264
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/share/CaptureUtils$5;

    invoke-direct {v1, p0}, Lcom/huawei/operation/share/CaptureUtils$5;-><init>(Lcom/huawei/operation/share/CaptureUtils;)V

    const/4 v2, 0x0

    invoke-static {v0, v4, v2, v1}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 270
    return-void
.end method
