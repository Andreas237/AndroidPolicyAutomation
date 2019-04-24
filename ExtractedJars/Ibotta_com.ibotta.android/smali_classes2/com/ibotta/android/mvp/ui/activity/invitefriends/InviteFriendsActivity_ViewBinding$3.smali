.class Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "InviteFriendsActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/invitefriends/InviteFriendsActivity;->onFacebookClicked()V

    return-void
.end method
