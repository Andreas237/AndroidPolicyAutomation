.class Lorg/jsoup/select/StructuralEvaluator$Not;
.super Lorg/jsoup/select/StructuralEvaluator;
.source "StructuralEvaluator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jsoup/select/StructuralEvaluator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Not"
.end annotation


# direct methods
.method public constructor <init>(Lorg/jsoup/select/Evaluator;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lorg/jsoup/select/StructuralEvaluator;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/jsoup/select/StructuralEvaluator$Not;->evaluator:Lorg/jsoup/select/Evaluator;

    return-void
.end method


# virtual methods
.method public matches(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)Z
    .locals 1

    .line 41
    iget-object v0, p0, Lorg/jsoup/select/StructuralEvaluator$Not;->evaluator:Lorg/jsoup/select/Evaluator;

    invoke-virtual {v0, p1, p2}, Lorg/jsoup/select/Evaluator;->matches(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, ":not%s"

    const/4 v1, 0x1

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lorg/jsoup/select/StructuralEvaluator$Not;->evaluator:Lorg/jsoup/select/Evaluator;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
