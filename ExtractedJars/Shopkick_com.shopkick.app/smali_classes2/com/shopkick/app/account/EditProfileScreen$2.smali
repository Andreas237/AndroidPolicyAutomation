.class Lcom/shopkick/app/account/EditProfileScreen$2;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


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

.field final synthetic val$profilePictureHelperCallback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/EditProfileScreen;Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iput-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->val$profilePictureHelperCallback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 151
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f090529

    const/4 v1, 0x1

    if-eq p1, v0, :cond_1

    const v0, 0x7f090726

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 153
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$100(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->createProfilePictureHelper()Lcom/shopkick/app/controllers/ProfilePictureHelper;

    move-result-object p1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->val$profilePictureHelperCallback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->launchCameraScreen(Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)Z

    return v1

    .line 157
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$100(Lcom/shopkick/app/account/EditProfileScreen;)Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->createProfilePictureHelper()Lcom/shopkick/app/controllers/ProfilePictureHelper;

    move-result-object p1

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$2;->val$profilePictureHelperCallback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->launchPictureGallery(Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)Z

    return v1
.end method
