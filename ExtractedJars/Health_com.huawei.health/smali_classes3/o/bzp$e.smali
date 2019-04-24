.class final Lo/bzp$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bzp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# static fields
.field private static final c:Lo/bzp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Lo/bzp;

    invoke-direct {v0}, Lo/bzp;-><init>()V

    sput-object v0, Lo/bzp$e;->c:Lo/bzp;

    return-void
.end method

.method static synthetic c()Lo/bzp;
    .locals 1

    .line 30
    sget-object v0, Lo/bzp$e;->c:Lo/bzp;

    return-object v0
.end method
