.class Lo/cod$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final b:Lo/cod;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Lo/cod;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cod;-><init>(Lo/cod$4;)V

    sput-object v0, Lo/cod$c;->b:Lo/cod;

    .line 47
    return-void
.end method
