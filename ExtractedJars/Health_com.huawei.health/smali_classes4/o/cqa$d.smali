.class Lo/cqa$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final b:Lo/cqa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lo/cqa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqa;-><init>(Lo/cqa$5;)V

    sput-object v0, Lo/cqa$d;->b:Lo/cqa;

    .line 40
    return-void
.end method
