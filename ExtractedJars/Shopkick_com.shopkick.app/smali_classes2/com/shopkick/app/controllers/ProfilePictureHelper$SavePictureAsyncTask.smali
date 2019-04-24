.class Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;
.super Landroid/os/AsyncTask;
.source "ProfilePictureHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/controllers/ProfilePictureHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SavePictureAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Landroid/content/Intent;",
        "Ljava/lang/String;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field private dialog:Landroid/app/ProgressDialog;

.field private weakRefProfilePictureHelper:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/controllers/ProfilePictureHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/controllers/ProfilePictureHelper;)V
    .locals 1

    .line 310
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 311
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->weakRefProfilePictureHelper:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Landroid/content/Intent;)Ljava/io/File;
    .locals 8

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->weakRefProfilePictureHelper:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    const/4 v1, 0x0

    .line 332
    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_8

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 338
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 346
    :try_start_0
    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$100(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v4, :cond_2

    if-eqz v4, :cond_1

    .line 377
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    return-object v1

    .line 352
    :cond_2
    :try_start_2
    new-instance v5, Landroid/support/media/ExifInterface;

    invoke-direct {v5, v4}, Landroid/support/media/ExifInterface;-><init>(Ljava/io/InputStream;)V

    .line 355
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 356
    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$100(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/content/ContentResolver;

    move-result-object v6

    invoke-virtual {v6, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 359
    :try_start_3
    new-instance v4, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$200(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".jpg"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 360
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 361
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 362
    :try_start_4
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v6, 0x32

    invoke-virtual {v0, v3, v6, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 363
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 366
    new-instance v0, Landroid/support/media/ExifInterface;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/support/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const-string v3, "Orientation"

    const-string v6, "Orientation"

    const/4 v7, 0x1

    .line 367
    invoke-virtual {v5, v6, v7}, Landroid/support/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v5}, Landroid/support/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    invoke-virtual {v0}, Landroid/support/media/ExifInterface;->saveAttributes()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz p1, :cond_3

    .line 377
    :try_start_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 380
    :cond_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 381
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    return-object v4

    :catch_2
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v2, v1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p1, v4

    goto :goto_1

    :catch_4
    move-exception v0

    move-object v2, v1

    move-object p1, v4

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object p1, v1

    goto :goto_1

    :catch_5
    move-exception v0

    move-object p1, v1

    move-object v2, p1

    .line 372
    :goto_0
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz p1, :cond_4

    .line 377
    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_4
    if-eqz v2, :cond_5

    .line 380
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 381
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    :catch_6
    :cond_5
    return-object v1

    :catchall_3
    move-exception v0

    move-object v1, v2

    :goto_1
    if-eqz p1, :cond_6

    .line 377
    :try_start_8
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_6
    if-eqz v1, :cond_7

    .line 380
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 381
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 383
    :catch_7
    :cond_7
    throw v0

    :cond_8
    :goto_2
    return-object v1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 304
    check-cast p1, [Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->doInBackground([Landroid/content/Intent;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method getNewExifOrientation()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onPostExecute(Ljava/io/File;)V
    .locals 2

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->weakRefProfilePictureHelper:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    if-nez v0, :cond_0

    return-void

    .line 394
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    .line 398
    :cond_1
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v1, 0x0

    .line 399
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    .line 402
    :try_start_0
    invoke-static {v0, p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$400(Lcom/shopkick/app/controllers/ProfilePictureHelper;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 404
    :catch_0
    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$300(Lcom/shopkick/app/controllers/ProfilePictureHelper;)V

    :goto_0
    return-void

    .line 395
    :cond_2
    :goto_1
    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$300(Lcom/shopkick/app/controllers/ProfilePictureHelper;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 304
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->onPostExecute(Ljava/io/File;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->weakRefProfilePictureHelper:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    if-nez v0, :cond_0

    return-void

    .line 321
    :cond_0
    new-instance v1, Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$000(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    .line 322
    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$000(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f1100f8

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 323
    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->access$000(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f1100f7

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 324
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 326
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    return-void
.end method
