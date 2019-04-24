.class final Lcom/huawei/health/suggestion/data/DBFactory$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# static fields
.field private static final a:Lo/btk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 542
    new-instance v0, Lo/btk;

    invoke-direct {v0}, Lo/btk;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$f;->a:Lo/btk;

    return-void
.end method

.method static synthetic d()Lo/btk;
    .locals 1

    .line 541
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$f;->a:Lo/btk;

    return-object v0
.end method
