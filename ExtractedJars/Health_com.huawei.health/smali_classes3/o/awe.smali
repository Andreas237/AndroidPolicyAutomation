.class public final Lo/awe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/awe;


# instance fields
.field private c:Lo/awb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lo/awe;

    invoke-direct {v0}, Lo/awe;-><init>()V

    sput-object v0, Lo/awe;->b:Lo/awe;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awe;->c:Lo/awb;

    .line 33
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 34
    new-instance v0, Lo/awb;

    invoke-direct {v0, v1}, Lo/awb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/awe;->c:Lo/awb;

    .line 35
    return-void
.end method

.method public static c()Lo/awe;
    .locals 1

    .line 39
    sget-object v0, Lo/awe;->b:Lo/awe;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;IZ)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/awe;->c:Lo/awb;

    invoke-virtual {v0, p1, p2, p3}, Lo/awb;->d(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v1

    .line 54
    return-object v1
.end method

.method public c(Ljava/lang/String;IZ)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lo/awe;->c:Lo/awb;

    invoke-virtual {v0, p1, p2, p3}, Lo/awb;->c(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v1

    .line 85
    return-object v1
.end method

.method public d(Ljava/lang/String;IZ)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lo/awe;->c:Lo/awb;

    invoke-virtual {v0, p1, p2, p3}, Lo/awb;->b(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v1

    .line 70
    return-object v1
.end method
