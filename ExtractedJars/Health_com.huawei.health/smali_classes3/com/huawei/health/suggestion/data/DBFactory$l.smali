.class final Lcom/huawei/health/suggestion/data/DBFactory$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "l"
.end annotation


# static fields
.field private static final e:Lo/bti;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 530
    new-instance v0, Lo/bti;

    invoke-direct {v0}, Lo/bti;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$l;->e:Lo/bti;

    return-void
.end method

.method static synthetic d()Lo/bti;
    .locals 1

    .line 529
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$l;->e:Lo/bti;

    return-object v0
.end method
