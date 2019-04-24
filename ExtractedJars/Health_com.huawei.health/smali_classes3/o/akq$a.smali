.class Lo/akq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final e:Lo/akq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Lo/akq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/akq;-><init>(Lo/akq$2;)V

    sput-object v0, Lo/akq$a;->e:Lo/akq;

    return-void
.end method

.method static synthetic b()Lo/akq;
    .locals 1

    .line 43
    sget-object v0, Lo/akq$a;->e:Lo/akq;

    return-object v0
.end method
