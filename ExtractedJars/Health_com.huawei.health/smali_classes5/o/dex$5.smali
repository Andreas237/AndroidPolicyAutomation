.class Lo/dex$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dex;->b(Lo/dez;Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dfm;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/dex;


# direct methods
.method constructor <init>(Lo/dex;)V
    .locals 0

    .line 667
    iput-object p1, p0, Lo/dex$5;->a:Lo/dex;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 667
    move-object v0, p1

    check-cast v0, Lo/dfm;

    move-object v1, p2

    check-cast v1, Lo/dfm;

    invoke-virtual {p0, v0, v1}, Lo/dex$5;->e(Lo/dfm;Lo/dfm;)I

    move-result v0

    return v0
.end method

.method public e(Lo/dfm;Lo/dfm;)I
    .locals 2

    .line 669
    invoke-virtual {p1}, Lo/dfm;->d()I

    move-result v0

    invoke-virtual {p2}, Lo/dfm;->d()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
