.class Lo/ako$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ako;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:Lo/ako;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Lo/ako;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ako;-><init>(Lo/ako$4;)V

    sput-object v0, Lo/ako$a;->a:Lo/ako;

    return-void
.end method

.method static synthetic a()Lo/ako;
    .locals 1

    .line 34
    sget-object v0, Lo/ako$a;->a:Lo/ako;

    return-object v0
.end method
