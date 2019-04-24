.class public Lo/amv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;DII)Ljava/lang/String;
    .locals 4

    .line 27
    invoke-static {p1, p2, p3, p4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    .line 29
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    const-string v0, ","

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 35
    :cond_0
    return-object v2
.end method
