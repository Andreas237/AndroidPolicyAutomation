.class Lo/dmv$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static final a:Lo/dmv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 194
    new-instance v0, Lo/dmv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dmv;-><init>(Lo/dmv$5;)V

    sput-object v0, Lo/dmv$d;->a:Lo/dmv;

    return-void
.end method

.method static synthetic a()Lo/dmv;
    .locals 1

    .line 193
    sget-object v0, Lo/dmv$d;->a:Lo/dmv;

    return-object v0
.end method
