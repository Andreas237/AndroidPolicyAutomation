.class public final Lo/bbq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/ImageView;I)V
    .locals 4

    .line 39
    if-nez p0, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bbe;->b(I)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 44
    if-eqz v3, :cond_1

    .line 46
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 47
    return-void

    .line 49
    :cond_1
    new-instance v0, Lo/bbq$2;

    invoke-direct {v0, p1, p0}, Lo/bbq$2;-><init>(ILandroid/widget/ImageView;)V

    sget-object v1, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 65
    invoke-virtual {v0, v1, v2}, Lo/bbq$2;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 66
    return-void
.end method

.method public static d()I
    .locals 1

    .line 70
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_message_head_portrait:I

    return v0
.end method
