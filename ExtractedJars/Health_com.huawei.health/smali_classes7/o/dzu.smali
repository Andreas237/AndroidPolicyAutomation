.class public Lo/dzu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 31
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 0

    .line 23
    sput-object p0, Lo/dzu;->e:Landroid/content/Context;

    .line 24
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 35
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 27
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    return-void
.end method
