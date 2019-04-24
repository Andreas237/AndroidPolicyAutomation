.class Lo/crj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/crj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 49
    new-instance v0, Lo/crj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crj;-><init>(Lo/crj$3;)V

    sput-object v0, Lo/crj$b;->b:Lo/crj;

    .line 50
    return-void
.end method
