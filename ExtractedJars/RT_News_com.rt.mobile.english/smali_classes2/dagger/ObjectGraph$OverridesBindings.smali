.class final Ldagger/ObjectGraph$OverridesBindings;
.super Ldagger/internal/BindingsGroup;
.source "ObjectGraph.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldagger/ObjectGraph;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "OverridesBindings"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 351
    invoke-direct {p0}, Ldagger/internal/BindingsGroup;-><init>()V

    return-void
.end method


# virtual methods
.method public contributeSetBinding(Ljava/lang/String;Ldagger/internal/SetBinding;)Ldagger/internal/Binding;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ldagger/internal/SetBinding<",
            "*>;)",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    .line 354
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Module overrides cannot contribute set bindings."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
