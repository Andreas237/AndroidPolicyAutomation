.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;
.super Ljava/lang/Object;
.source "ImLoginResources.java"


# instance fields
.field private final res:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->res:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public getAccountCreatedAlertTitle(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->res:Landroid/content/res/Resources;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11038a

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getEmailValidationRequiredBody(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->res:Landroid/content/res/Resources;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const p1, 0x7f11038d

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getEmailValidationRequiredButtonText()Ljava/lang/String;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->res:Landroid/content/res/Resources;

    const v1, 0x7f11038e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmailValidationRequiredTitle()Ljava/lang/String;
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;->res:Landroid/content/res/Resources;

    const v1, 0x7f11038f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
