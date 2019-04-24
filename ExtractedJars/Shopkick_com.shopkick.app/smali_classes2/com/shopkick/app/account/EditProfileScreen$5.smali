.class Lcom/shopkick/app/account/EditProfileScreen$5;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EditProfileScreen;
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

    .line 334
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$5;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 338
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$5;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-boolean p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    if-eqz p1, :cond_0

    .line 339
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$5;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    :cond_0
    return-void
.end method
