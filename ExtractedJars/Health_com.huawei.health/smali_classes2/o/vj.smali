.class public Lo/vj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 6
    const/4 v0, 0x1

    sput-boolean v0, Lo/vj;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 9
    sget-boolean v0, Lo/vj;->c:Z

    if-eqz v0, :cond_0

    .line 10
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    :cond_0
    return-void
.end method
