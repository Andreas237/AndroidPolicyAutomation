.class Lcom/shopkick/app/account/EditProfileScreen$1;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/account/EditProfileScreen;->setupProfilePhotoContextMenu(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/EditProfileScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/EditProfileScreen;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public photoCropped([B)V
    .locals 3

    const v0, 0x7f110511

    const v1, 0x7f110155

    if-nez p1, :cond_0

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$000(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    .line 132
    invoke-virtual {v2, v1}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    .line 133
    invoke-virtual {v2, v0}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 131
    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void

    .line 139
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v2, v2, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/application/ProfileInfo;->uploadPhoto([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 141
    :catch_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$000(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    .line 142
    invoke-virtual {v2, v1}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$1;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    .line 143
    invoke-virtual {v2, v0}, Lcom/shopkick/app/account/EditProfileScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
    return-void
.end method
