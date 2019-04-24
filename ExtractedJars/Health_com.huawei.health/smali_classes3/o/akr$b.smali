.class Lo/akr$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field private static final b:Lo/akr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lo/akr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/akr;-><init>(Lo/akr$2;)V

    sput-object v0, Lo/akr$b;->b:Lo/akr;

    return-void
.end method

.method static synthetic e()Lo/akr;
    .locals 1

    .line 26
    sget-object v0, Lo/akr$b;->b:Lo/akr;

    return-object v0
.end method
