.class public Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ImTermsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    const-string v0, "field \'clImDetailHeader\'"

    .line 29
    const-class v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const v2, 0x7f0900f6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const-string v0, "field \'tvImTermsShareInfo\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090530

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->tvImTermsShareInfo:Landroid/widget/TextView;

    const-string v0, "field \'bImTermsConnect\'"

    .line 31
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f09008d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->bImTermsConnect:Landroid/widget/Button;

    const-string v0, "field \'tvImTermsShare\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09052f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->tvImTermsShare:Landroid/widget/TextView;

    const-string v0, "field \'sImTermsShare\'"

    .line 33
    const-class v1, Landroid/widget/Switch;

    const v2, 0x7f0903e4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/Switch;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->sImTermsShare:Landroid/widget/Switch;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->tvImTermsShareInfo:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->bImTermsConnect:Landroid/widget/Button;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->tvImTermsShare:Landroid/widget/TextView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->sImTermsShare:Landroid/widget/Switch;

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
