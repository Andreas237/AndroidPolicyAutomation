.class public Lo/wm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-string v0, ""

    sput-object v0, Lo/wm;->a:Ljava/lang/String;

    .line 20
    const-string v0, ""

    sput-object v0, Lo/wm;->b:Ljava/lang/String;

    .line 21
    const-string v0, ""

    sput-object v0, Lo/wm;->d:Ljava/lang/String;

    .line 22
    const/4 v0, 0x1

    sput-boolean v0, Lo/wm;->e:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    .line 50
    const-string v0, "SnsConstants"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setService_token "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    sput-object p0, Lo/wm;->b:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    .line 37
    sput-object p0, Lo/wm;->d:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public static b(Z)V
    .locals 0

    .line 60
    sput-boolean p0, Lo/wm;->e:Z

    .line 61
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    .line 29
    sput-object p0, Lo/wm;->a:Ljava/lang/String;

    .line 30
    return-void
.end method
