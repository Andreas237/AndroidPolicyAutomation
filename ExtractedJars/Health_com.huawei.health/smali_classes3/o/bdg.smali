.class public Lo/bdg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdg;->e:Landroid/app/AlertDialog;

    .line 66
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 193
    iget-object v0, p0, Lo/bdg;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdg;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/bdg;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 197
    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 3

    .line 219
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 220
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 221
    const-string v0, "select_mode"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 222
    const-string v0, "isContainSelf"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 223
    const/4 v0, 0x3

    invoke-virtual {p1, v2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 224
    return-void
.end method

.method public c(Landroid/app/Activity;JILjava/lang/String;)V
    .locals 2

    .line 76
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    const-string v0, "ChatCommonEvent"

    const-string v1, "The click str is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return-void

    .line 82
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    nop

    .line 86
    .line 90
    :cond_1
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 2

    .line 231
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 232
    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 233
    const/4 v0, 0x1

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 234
    return-void
.end method

.method public e(Landroid/app/Activity;)Landroid/net/Uri;
    .locals 7

    .line 241
    const-string v0, "ChatCommonEvent"

    const-string v1, "goto system camera"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    .line 244
    const-string v0, "mounted"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 246
    sget v0, Lcom/huawei/android/sns/R$string;->sns_chat_photo_nosdcard:I

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 247
    const-string v0, "ChatCommonEvent"

    const-string v1, "--openSystemCapure.  sdcard is not ok."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const/4 v0, 0x0

    return-object v0

    .line 251
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    const/4 v0, 0x3

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 252
    const-string v0, "mime_type"

    const-string v1, "image/jpg"

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    invoke-virtual {p1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 255
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 256
    const-string v0, "output"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 257
    const-string v0, "com.huawei.camera"

    const/4 v1, 0x2

    invoke-static {p1, v5, v0, v1}, Lo/bnx;->d(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;I)Z

    move-result v6

    .line 258
    if-nez v6, :cond_1

    .line 260
    sget v0, Lcom/huawei/android/sns/R$string;->sns_start_app_failed:I

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 261
    const-string v0, "ChatCommonEvent"

    const-string v1, "no activity found to handle image capture."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    :cond_1
    return-object v4
.end method

.method public e(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 204
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {v2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 205
    const-string v0, "totalList"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 206
    const-string v0, "selectedList"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 208
    const-string v0, "isSendOriginal"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 209
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 210
    const-string v0, "isDisplaySelect"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 211
    const/4 v0, 0x1

    invoke-virtual {p1, v2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 212
    return-void
.end method
