.class Lo/dqs$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final b:Lo/dqs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 186
    new-instance v0, Lo/dqs;

    invoke-direct {v0}, Lo/dqs;-><init>()V

    sput-object v0, Lo/dqs$e;->b:Lo/dqs;

    return-void
.end method
