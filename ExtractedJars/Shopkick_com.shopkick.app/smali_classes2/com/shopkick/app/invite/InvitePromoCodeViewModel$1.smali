.class Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;
.super Landroid/databinding/Observable$OnPropertyChangedCallback;
.source "InvitePromoCodeViewModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/invite/InvitePromoCodeViewModel;-><init>(Landroid/app/Application;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/launch/FirstUseControllerV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitePromoCodeViewModel;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-direct {p0}, Landroid/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroid/databinding/Observable;I)V
    .locals 0

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object p1, p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shouldShowInvitedFriends:Landroid/databinding/ObservableBoolean;

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object p2, p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    .line 116
    invoke-virtual {p2}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object p2, p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendDisclaimerText:Landroid/databinding/ObservableField;

    invoke-virtual {p2}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object p2, p2, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {p2}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 115
    :goto_0
    invoke-virtual {p1, p2}, Landroid/databinding/ObservableBoolean;->set(Z)V

    return-void
.end method
