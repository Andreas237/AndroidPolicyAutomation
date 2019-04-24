.class Lcom/huawei/feedback/ui/as;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1198
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/as;->a:Ljava/lang/String;

    .line 1199
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/as;->b:Ljava/lang/String;

    .line 1203
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1206
    iget-object v0, p0, Lcom/huawei/feedback/ui/as;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1210
    iput-object p1, p0, Lcom/huawei/feedback/ui/as;->a:Ljava/lang/String;

    .line 1211
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1214
    iget-object v0, p0, Lcom/huawei/feedback/ui/as;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 1218
    iput-object p1, p0, Lcom/huawei/feedback/ui/as;->b:Ljava/lang/String;

    .line 1219
    return-void
.end method
