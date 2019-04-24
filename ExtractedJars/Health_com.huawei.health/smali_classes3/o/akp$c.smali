.class Lo/akp$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final c:Lo/akp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 11
    new-instance v0, Lo/akp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/akp;-><init>(Lo/akp$2;)V

    sput-object v0, Lo/akp$c;->c:Lo/akp;

    return-void
.end method

.method static synthetic b()Lo/akp;
    .locals 1

    .line 10
    sget-object v0, Lo/akp$c;->c:Lo/akp;

    return-object v0
.end method
