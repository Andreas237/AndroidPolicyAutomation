.class public final Lo/avy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/avy;


# instance fields
.field private a:Lo/avz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lo/avy;

    invoke-direct {v0}, Lo/avy;-><init>()V

    sput-object v0, Lo/avy;->e:Lo/avy;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avy;->a:Lo/avz;

    .line 32
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 33
    new-instance v0, Lo/avz;

    invoke-direct {v0, v1}, Lo/avz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/avy;->a:Lo/avz;

    .line 34
    return-void
.end method

.method public static d()Lo/avy;
    .locals 1

    .line 38
    sget-object v0, Lo/avy;->e:Lo/avy;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lo/avy;->a:Lo/avz;

    invoke-virtual {v0, p1, p2}, Lo/avz;->b(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 51
    return-object v1
.end method

.method public d(Ljava/lang/String;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/avy;->a:Lo/avz;

    invoke-virtual {v0, p1, p2}, Lo/avz;->c(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 64
    return-object v1
.end method

.method public e(Ljava/lang/String;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lo/avy;->a:Lo/avz;

    invoke-virtual {v0, p1, p2}, Lo/avz;->a(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 77
    return-object v1
.end method
