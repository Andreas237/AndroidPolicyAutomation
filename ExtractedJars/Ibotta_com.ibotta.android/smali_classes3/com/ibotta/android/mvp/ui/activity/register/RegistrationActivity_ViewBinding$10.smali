.class Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "RegistrationActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;->val$target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 140
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;->val$target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->onSignUpClicked()V

    return-void
.end method
