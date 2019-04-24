.class Lo/dlx$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final b:Lo/dlx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Lo/dlx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dlx;-><init>(Lo/dlx$4;)V

    sput-object v0, Lo/dlx$a;->b:Lo/dlx;

    return-void
.end method

.method static synthetic d()Lo/dlx;
    .locals 1

    .line 52
    sget-object v0, Lo/dlx$a;->b:Lo/dlx;

    return-object v0
.end method
