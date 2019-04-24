.class public Lo/dnc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 17
    invoke-static {p0}, Lo/dnl;->c(Landroid/content/Context;)Lo/dnl;

    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, Lo/dnl;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
