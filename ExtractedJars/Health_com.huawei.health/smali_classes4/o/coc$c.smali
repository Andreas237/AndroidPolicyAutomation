.class Lo/coc$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/coc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final c:Lo/coc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 76
    new-instance v0, Lo/coc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/coc;-><init>(Lo/coc$4;)V

    sput-object v0, Lo/coc$c;->c:Lo/coc;

    .line 77
    return-void
.end method
