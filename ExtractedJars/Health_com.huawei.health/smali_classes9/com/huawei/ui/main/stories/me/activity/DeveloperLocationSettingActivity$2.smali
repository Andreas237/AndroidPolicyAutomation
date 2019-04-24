.class Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/InputFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity$2;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 5

    .line 343
    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    .line 344
    const-string v0, ""

    return-object v0

    .line 346
    :cond_0
    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    const-string v0, "0."

    return-object v0

    .line 349
    :cond_1
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 350
    const-string v0, "\\."

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 351
    array-length v0, v3

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 352
    const/4 v0, 0x1

    aget-object v4, v3, v0

    .line 353
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 354
    const-string v0, ""

    return-object v0

    .line 357
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
