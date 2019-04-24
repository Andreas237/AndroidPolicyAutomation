.class final Lcom/huawei/health/suggestion/data/DBFactory$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final e:Lo/bss;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 562
    new-instance v0, Lo/bss;

    invoke-direct {v0}, Lo/bss;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$a;->e:Lo/bss;

    return-void
.end method

.method static synthetic d()Lo/bss;
    .locals 1

    .line 561
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$a;->e:Lo/bss;

    return-object v0
.end method
