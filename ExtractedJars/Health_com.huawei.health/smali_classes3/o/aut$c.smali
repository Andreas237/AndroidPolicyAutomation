.class Lo/aut$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aut;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final e:Lo/aut;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Lo/aut;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aut;-><init>(Lo/aut$1;)V

    sput-object v0, Lo/aut$c;->e:Lo/aut;

    return-void
.end method
