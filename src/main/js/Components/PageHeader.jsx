import React from 'react';
import { Typography } from '@mui/material';

function PageHeader(props) {
    return (
        <Typography variant="h2" component="h2" sx={{
            paddingTop: 3,
            color: props.color
        }}>
            {props.message}
        </Typography>
    );
}

export default PageHeader;