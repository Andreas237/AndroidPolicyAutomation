.class Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;
.super Ljava/lang/Object;
.source "RegistrationActivity_ViewBinding.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


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

    .line 109
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;->val$target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 112
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;->val$target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->onZipCodeFocusChange()V

    return-void
.end method
