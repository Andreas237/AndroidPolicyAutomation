.class public Lo/eke;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static c:I

.field private static d:I

.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const/4 v0, 0x2

    sput v0, Lo/eke;->c:I

    .line 14
    const/4 v0, 0x1

    sput v0, Lo/eke;->d:I

    .line 16
    const/4 v0, 0x1

    sput v0, Lo/eke;->e:I

    .line 17
    const/4 v0, 0x7

    sput v0, Lo/eke;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()I
    .locals 1

    .line 27
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    sget v0, Lo/eke;->d:I

    return v0

    .line 30
    :cond_0
    sget v0, Lo/eke;->a:I

    return v0
.end method

.method public static c()I
    .locals 1

    .line 20
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21
    sget v0, Lo/eke;->c:I

    return v0

    .line 23
    :cond_0
    sget v0, Lo/eke;->e:I

    return v0
.end method
