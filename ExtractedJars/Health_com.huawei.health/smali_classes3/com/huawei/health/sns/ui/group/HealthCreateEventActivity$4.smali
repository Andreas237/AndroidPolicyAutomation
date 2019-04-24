.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/InputFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 1210
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 2

    .line 1213
    const-string v1, "&<>[]$()%+\\/#`*=^|"

    .line 1214
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1215
    const-string v0, ""

    return-object v0

    .line 1217
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
