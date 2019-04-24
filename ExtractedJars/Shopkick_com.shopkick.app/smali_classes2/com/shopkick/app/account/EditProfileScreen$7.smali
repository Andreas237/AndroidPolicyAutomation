.class Lcom/shopkick/app/account/EditProfileScreen$7;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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

    .line 367
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$7;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 p1, 0x1

    if-ne p3, p1, :cond_0

    .line 372
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen$7;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p2, p2, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    if-ne p3, p1, :cond_1

    .line 374
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen$7;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p2, p2, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    goto :goto_0

    .line 376
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$7;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->gender:Ljava/lang/Integer;

    .line 378
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$7;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$200(Lcom/shopkick/app/account/EditProfileScreen;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
