.class Lo/crg$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final b:Lo/crg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Lo/crg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crg;-><init>(Lo/crg$1;)V

    sput-object v0, Lo/crg$c;->b:Lo/crg;

    .line 45
    return-void
.end method
