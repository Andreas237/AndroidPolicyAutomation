.class Lo/crc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final e:Lo/crc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lo/crc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crc;-><init>(Lo/crc$1;)V

    sput-object v0, Lo/crc$a;->e:Lo/crc;

    .line 39
    return-void
.end method
