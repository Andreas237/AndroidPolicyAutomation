.class Lo/cox$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/cox;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 90
    new-instance v0, Lo/cox;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cox;-><init>(Lo/cox$2;)V

    sput-object v0, Lo/cox$d;->c:Lo/cox;

    .line 91
    return-void
.end method
