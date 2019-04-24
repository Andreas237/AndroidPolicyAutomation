.class Lo/cpw$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final b:Lo/cpw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Lo/cpw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpw;-><init>(Lo/cpw$5;)V

    sput-object v0, Lo/cpw$a;->b:Lo/cpw;

    .line 47
    return-void
.end method
