.class Lo/act$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/act;->e()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/acu;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/act;


# direct methods
.method constructor <init>(Lo/act;)V
    .locals 0

    .line 584
    iput-object p1, p0, Lo/act$10;->b:Lo/act;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/acu;Lo/acu;)I
    .locals 3

    .line 587
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 588
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 590
    :cond_1
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    move-result-object v2

    .line 591
    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 584
    move-object v0, p1

    check-cast v0, Lo/acu;

    move-object v1, p2

    check-cast v1, Lo/acu;

    invoke-virtual {p0, v0, v1}, Lo/act$10;->c(Lo/acu;Lo/acu;)I

    move-result v0

    return v0
.end method
