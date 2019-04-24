.class Lo/cnv$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cnv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/cnv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Lo/cnv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cnv;-><init>(Lo/cnv$5;)V

    sput-object v0, Lo/cnv$d;->c:Lo/cnv;

    .line 54
    return-void
.end method
