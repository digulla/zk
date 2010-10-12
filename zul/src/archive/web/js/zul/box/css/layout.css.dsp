<%@ taglib uri="http://www.zkoss.org/dsp/web/core" prefix="c" %>
.z-hlayout, .z-vlayout {
	overflow: hidden;
<c:if test="${c:isExplorer() and not c:browser('ie8')}">
	position: relative;
</c:if>
}
.z-hlayout {
	white-space: nowrap;
}
.z-hlayout-inner {
	display:-moz-inline-box;
	display: inline-block;
	position: relative;
	vertical-align: middle; <%-- so it aligned better with single-line label --%>
	zoom: 1;
<c:if test="${c:isExplorer() and not c:browser('ie8')}">
	display: inline;
</c:if>
}

<c:if test="${not c:browser('ie6-')}">
.z-valign-bottom > .z-hlayout-inner {
	vertical-align: bottom;
}
.z-valign-top > .z-hlayout-inner {
	vertical-align: top;
}
.z-valign-middle > .z-hlayout-inner {
	vertical-align: middle;
}
</c:if>
<c:if test="${c:browser('ie6-')}">
.z-valign-bottom .z-hlayout-inner {
	vertical-align: bottom;
}
.z-valign-top .z-hlayout-inner {
	vertical-align: top;
}
.z-valign-middle .z-hlayout-inner {
	vertical-align: middle;
}
</c:if>

.z-vlayout-inner {
	position: relative;
	zoom: 1;
}
