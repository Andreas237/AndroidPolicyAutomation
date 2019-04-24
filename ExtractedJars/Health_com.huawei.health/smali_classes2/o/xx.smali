.class public Lo/xx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/xx$c;,
        Lo/xx$e;,
        Lo/xx$b;
    }
.end annotation


# static fields
.field private static b:Ljava/lang/String;

.field private static c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/16 v0, 0xd

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/xx;->c:[I

    .line 214
    const-string v0, "com.huawei.bone"

    sput-object v0, Lo/xx;->b:Ljava/lang/String;

    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x4
        0x8
        0x10
        0x20
        0x40
        0x80
        0x100
        0x200
        0x400
        0x800
        0x1000
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 211
    sput-object p0, Lo/xx;->b:Ljava/lang/String;

    .line 212
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 207
    sget-object v0, Lo/xx;->b:Ljava/lang/String;

    return-object v0
.end method
