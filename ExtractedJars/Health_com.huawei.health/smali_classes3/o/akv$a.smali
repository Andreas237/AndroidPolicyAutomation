.class Lo/akv$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final e:Lo/akv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 71
    new-instance v0, Lo/akv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/akv;-><init>(Lo/akv$3;)V

    sput-object v0, Lo/akv$a;->e:Lo/akv;

    return-void
.end method

.method static synthetic a()Lo/akv;
    .locals 1

    .line 70
    sget-object v0, Lo/akv$a;->e:Lo/akv;

    return-object v0
.end method
